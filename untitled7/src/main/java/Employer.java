public class Employer {
    String name;
    String pose;
    int wallet;

    Employer(String name, String pose, int wallet){
        this.name = name;
        this.pose = pose;
        this.wallet = wallet;
    }

    public String check(){
        return(name + " have a pose: " + pose);
    }
    public String checkWallet(){
        return(name + "'s wallet have a " + wallet + " rubles");
    }

}
