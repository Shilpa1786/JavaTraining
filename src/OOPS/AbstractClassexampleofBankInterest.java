package OOPS;


abstract class rateofinterest{
    abstract int getrateofinterest();
}

class SBIrateofinterest extends rateofinterest{
    @Override
    int getrateofinterest() {
        return 7;
    }
}

class PNBrateofinterest extends rateofinterest{
    @Override
    int getrateofinterest() {
        return 8;
    }
}

public class AbstractClassexampleofBankInterest {

    public static void main(String[] args) {
        rateofinterest rt = new SBIrateofinterest();
        System.out.println("SBI rate of interest " +rt.getrateofinterest() +"%");
        rateofinterest rti = new PNBrateofinterest();
        System.out.println("PNB rate of interest " +rti.getrateofinterest() +"%");
    }
}


