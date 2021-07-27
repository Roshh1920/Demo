package Daytwo;



abstract class PassportHO
{
    abstract void verifyProof(); //abstract Method

    void finalApproval() //Concrete Method
    {
        System.out.println("Passport Issued");
    }
}
 
class ChennaiPO extends PassportHO
{
 
    @Override
    void verifyProof() {
        System.out.println("Verify with DVL");

    }

}
class BengaluruPO extends PassportHO
{
 
    @Override
    void verifyProof() {
        System.out.println("Verified with Ration Card");

    }

}
public class Absdemo 
{
    public static void main(String[] args) 
    {
            PassportHO chn=new ChennaiPO();
            chn.verifyProof();
            chn.finalApproval();
            PassportHO bglr=new BengaluruPO();
            bglr.verifyProof();
            bglr.finalApproval();

    }
}