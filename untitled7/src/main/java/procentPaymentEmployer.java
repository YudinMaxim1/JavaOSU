class procentPaymentEmployer extends Employer{
    double payment;
    double procent;

    procentPaymentEmployer(String name, String pose, int wallet, double procent) {
        super(name, pose, wallet);
        this.procent = procent;
    }

    public double pay(double countOfPayment){
        return (int)(this.wallet + (countOfPayment*(this.procent/100)));
    }

    public String check(){
        return(name + " have a pose: " + pose + "\nPayment: " + payment + " rubles");
    }
}
