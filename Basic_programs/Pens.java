class Pens {
    public static void main(String[] args){
        int totaly=14;
        int kids=3;
        int e=totaly/kids;
        int leftover= totaly % kids;
        System.out.println(
            "The Pen Per Student is " + e +
            " and the remaining pen not distributed is " + leftover
        );
    }
}
