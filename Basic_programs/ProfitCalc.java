class ProfitCalc{
    public static void main(String[] args){
        double cp= 129;
        double sp= 191;
		double prof = sp - cp;
        double profPercent = (prof/cp)*100;
        System.out.println(
            "The Cost Price is INR " + cp + " and Selling Price is INR " + sp + "\n" +
            "The Profit is INR " + prof + " and the Profit Percentage is " + profPercent + "%"
        );
    }
}
