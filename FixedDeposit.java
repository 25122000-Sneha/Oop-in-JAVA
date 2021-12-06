
abstract class Bank
{
        int roi, interest;
        abstract int getroi();
        void display(String bank_name, String branch_name, String IFSC_code)
        {
                System.out.println("Bank suitable for his FD-\r\n");
                System.out.println("Bank: "+bank_name+"\r\nBranch: "+branch_name +"\r\nIFSC Code: "+IFSC_code);
        }
        
}

class SBI extends Bank
{
        int getroi()
        {
                roi = 6;
                interest = (50000*1*roi)/100;
                return interest;
        }
}

class PNB extends Bank
{
        int getroi()
        {
                roi = 7;
                interest = (50000*1*roi)/100;
                return interest;
        }
}

class AXIS extends Bank
{
        int getroi()
        {
                roi = 8;
                interest = (50000*1*roi)/100;
                return interest;
        }
}

class HDFC extends Bank
{
        int getroi()
        {
                roi = 9;
                interest = (50000*1*roi)/100;
                return interest;
        }
}

class FixedDeposit
{
        public static void main(String[] args){
        
        Bank sbi = new SBI();
        Bank pnb = new PNB();
        Bank axis = new AXIS();
        Bank hdfc = new HDFC();
        
        
        if((sbi.getroi() > pnb.getroi()) && (sbi.getroi() > axis.getroi()) && (sbi.getroi() > hdfc.getroi()))
        {
                sbi.display("SBI", "Cossipore" , "SBIN0000001");
                System.out.println("Interest amount : Rs "+sbi.getroi());
        }
        else if((pnb.getroi() > sbi.getroi()) && (pnb.getroi() > axis.getroi()) && (pnb.getroi() > hdfc.getroi()))
        {
                pnb.display("PNB", "Rajarhat", "PUNB0000004");
                System.out.println("Interest amount : Rs "+pnb.getroi());
        }
        else if((axis.getroi() > sbi.getroi()) && (axis.getroi() > pnb.getroi()) && (axis.getroi() > hdfc.getroi()))
        {
                axis.display("AXIS", "Garia", "AXIS0000006");
                System.out.println("Interest amount : Rs "+axis.getroi());
        }
        else
        {
                hdfc.display("HDFC", "Esplanade", "HDFC0000002");
                System.out.println("Interest amount : Rs "+hdfc.getroi());
        }
        }
}
        