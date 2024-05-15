class fullTimeEmployer extends Employer{
    int payment;

    fullTimeEmployer(String name, String pose, int wallet, int payment) {
        super(name, pose, wallet);
        this.payment = payment;
    }

    public int pay(int countOfPayment){
        return (this.wallet + countOfPayment);
    }

    public String check(){
        return(name + " have a pose: " + pose + "\nPayment: " + payment + " rubles");
    }

}
