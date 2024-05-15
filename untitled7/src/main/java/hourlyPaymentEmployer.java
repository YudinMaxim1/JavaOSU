class hourlyPaymentEmployer extends Employer{
    int payment;

    hourlyPaymentEmployer(String name, String pose, int wallet, int payment) {
        super(name, pose, wallet);
        this.payment = payment;
    }

    public int pay(int countOfPayment, int countOfHours){
        return (this.wallet + countOfPayment*countOfHours);
    }

    public String check(){
        return(name + " have a pose: " + pose + "\nHourly payment: " + payment + " rubles");
    }


}
