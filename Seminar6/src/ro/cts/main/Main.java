
package ro.cts.main;

import ro.cts.main.module.AdaptorMedicament;
import ro.cts.main.module.MedicamentSpital;
import ro.cts.main.module.MedicamentFarmacie;

public class Main {

    public static void vindeMedicamente(MedicamentFarmacie medicament){
        medicament.cumparaMedicament();
    }

    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Medi", 50, true, "11.02.2029");
        vindeMedicamente(medicamentFarmacie);
        MedicamentSpital medicamentSpital = new MedicamentSpital("Medi2", 45);
        AdaptorMedicament adaptorMedicament = new AdaptorMedicament(medicamentSpital);
        vindeMedicamente(adaptorMedicament);
    }
}
