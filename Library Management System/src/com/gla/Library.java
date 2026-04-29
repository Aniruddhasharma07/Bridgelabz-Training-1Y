package com.gla;

import java.sql.*;

public class Library {

    public void addBook(Book book) {
        try {
            Connection con = DBConnection.getConnection();

            String query = "INSERT INTO books VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, book.getId());
            ps.setString(2, book.getName());
            ps.setString(3, book.getCategory().name());
            ps.setString(4, book.getAuthor());
            ps.setString(5, book.getPublisher());
            ps.setInt(6, book.getPrice());
            ps.setBoolean(7, false);

            ps.executeUpdate();
            System.out.println("Book added!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showBooks() {
        try {
            Connection con = DBConnection.getConnection();

            String query = "SELECT * FROM books";
            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getString("category") + " | " +
                                rs.getBoolean("issued")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void issueBook(int bookId, User user) {
        try {
            Connection con = DBConnection.getConnection();

            String check = "SELECT issued FROM books WHERE id=?";
            PreparedStatement ps1 = con.prepareStatement(check);
            ps1.setInt(1, bookId);

            ResultSet rs = ps1.executeQuery();

            if (rs.next() && rs.getBoolean("issued")) {
                System.out.println("Already issued!");
                return;
            }

            String query = "UPDATE books SET issued=true WHERE id=?";
            PreparedStatement ps2 = con.prepareStatement(query);
            ps2.setInt(1, bookId);

            int rows = ps2.executeUpdate();

            if (rows > 0) {
                System.out.println("Issued to " + user.getName());
            } else {
                System.out.println("Book not found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}