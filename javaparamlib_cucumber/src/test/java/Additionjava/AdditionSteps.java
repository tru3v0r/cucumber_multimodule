package Additionjava;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.opentestfactory.exception.ParameterException;
import org.opentestfactory.util.ParameterService;
public class AdditionSteps {
    public AdditionSteps() throws ParameterException {
    }
    // récupérer la valeur des CUF du cas de test
    int var1 = ParameterService.INSTANCE.getInt("TC_CUF_VAR1");
    int var2 = ParameterService.INSTANCE.getInt("TC_CUF_VAR2");
    int res =  ParameterService.INSTANCE.getInt("TC_CUF_RES");

    boolean BOOLEAN = ParameterService.INSTANCE.getBoolean("TC_CUF_BOOLEAN");
    double DOUBLE  = ParameterService.INSTANCE.getDouble("TC_CUF_DOUBLE");
    float FLOAT = ParameterService.INSTANCE.getFloat("TC_CUF_FLOAT");
    String STRING = ParameterService.INSTANCE.getString("TC_CUF_test");

    // récupérer la valeur des CUF de l'itération
    boolean ITBOOLEAN = ParameterService.INSTANCE.getBoolean("IT_CUF_BOOLEAN");
    double ITDOUBLE  = ParameterService.INSTANCE.getDouble("IT_CUF_DOUBLE");
    float ITFLOAT = ParameterService.INSTANCE.getFloat("IT_CUF_FLOAT");
    String ITSTRING = ParameterService.INSTANCE.getString("IT_CUF_test");

    // récupérer la valeur des CUF de la campagne
    boolean CPGBOOLEAN = ParameterService.INSTANCE.getBoolean("CPG_CUF_BOOLEAN");
    double CPGDOUBLE  = ParameterService.INSTANCE.getDouble("CPG_CUF_DOUBLE");
    float CPGFLOAT = ParameterService.INSTANCE.getFloat("CPG_CUF_FLOAT");
    String CPGSTRING = ParameterService.INSTANCE.getString("CPG_CUF_test");

    // récupérer la valeur des CUF de la suite de tests
    boolean TSBOOLEAN = ParameterService.INSTANCE.getBoolean("TS_CUF_BOOLEAN");
    double TSDOUBLE  = ParameterService.INSTANCE.getDouble("TS_CUF_DOUBLE");
    float TSFLOAT = ParameterService.INSTANCE.getFloat("TS_CUF_FLOAT");
    String TSSTRING = ParameterService.INSTANCE.getString("TS_CUF_test");

    //CUF non existant pour test non passant
    // int not = ParameterService.INSTANCE.getInt("TC_CUF_not");
    String notstring = ParameterService.INSTANCE.getString("TC_CUF_FLOAT");

    // récupérer la valeur du dataset du cas de test
    String DSSTRING = ParameterService.INSTANCE.getString("DS_TEST");
    int DSINT =  ParameterService.INSTANCE.getInt("DS_INT");
    float DSFLOAT = ParameterService.INSTANCE.getFloat("DS_FLOAT");
    boolean DSBOOLEAN = ParameterService.INSTANCE.getBoolean("DS_BOOLEAN");

    //vérification de la mise en place de la valeur par défaut si paramètre non trouvé
    String param = ParameterService.INSTANCE.getString("DS_NOTFOUND","param_not_found");

    //récupérer la valeur d'un paramètre de test
    String paramTest = ParameterService.INSTANCE.getTestString("DS_TEST");

    //vérification paramètres globaux seulement en Devops avec un PEAC approprié

    //récupérer la valeur d'un paramètre global au niveau du cas de test
    int globalInt = ParameterService.INSTANCE.getGlobalInt("DS_INT");
    boolean globalBOOLEAN = ParameterService.INSTANCE.getGlobalBoolean("DS_BOOLEAN");
    float globalFLOAT = ParameterService.INSTANCE.getGlobalFloat("DS_FLOAT");
    String globalSTRING = ParameterService.INSTANCE.getGlobalString("DS_TEST");
    int globalres =  ParameterService.INSTANCE.getGlobalInt("TC_CUF_RES");
    String DSNAME = ParameterService.INSTANCE.getGlobalString("DSNAME");
    String TCREF = ParameterService.INSTANCE.getGlobalString("TC_REFERENCE");

    //récupérer la valeur d'un paramètre global au niveau de l'itération
    float ITglobalFLOAT = ParameterService.INSTANCE.getGlobalFloat("IT_CUF_FLOAT");
    String ITglobalSTRING = ParameterService.INSTANCE.getGlobalString("IT_CUF_test");

    //récupérer la valeur d'un paramètre global au niveau de la campagne
    boolean CPGglobalBOOLEAN = ParameterService.INSTANCE.getGlobalBoolean("CPG_CUF_BOOLEAN");
    double CPGglobalDOUBLE  = ParameterService.INSTANCE.getGlobalDouble("CPG_CUF_DOUBLE");

    //récupérer la valeur d'un paramètre global au niveau de la suite de tests
    float TSglobalFLOAT = ParameterService.INSTANCE.getGlobalFloat("TS_CUF_FLOAT");
    String TSglobalSTRING = ParameterService.INSTANCE.getGlobalString("TS_CUF_test");

    @Given("Je fais l'addition des valeurs CUF")
    public void je_fais_l_addition_des_valeurs_cuf() throws ParameterException {
        int res_var = var1 + var2;
        Assertions.assertEquals(res,res_var,"wrong addition result");
        System.out.println("le résultat des variables "+ var1+ " et "+var2+ " est " +res_var);
        System.out.println("la variable float convertie en string est " +notstring);
    }
    @Then("Le resultat est egale a la valeur du CUF RES")
    public void le_resultat_est_egale_a_la_valeur_du_cuf_res() {
        Assertions.assertTrue(BOOLEAN,"wrong boolean TC CUF");
        Assertions.assertEquals(DOUBLE,0.0002,"wrong double TC CUF");
        Assertions.assertEquals(FLOAT,0.001256f,"wrong float TC CUF");
        Assertions.assertEquals(STRING,"test++@","wrong string TC CUF");

        Assertions.assertTrue(ITBOOLEAN,"wrong boolean IT CUF");
        Assertions.assertEquals(ITDOUBLE,0.0002,"wrong double IT CUF");
        Assertions.assertEquals(ITFLOAT,0.001256f,"wrong float IT CUF");
        Assertions.assertEquals(ITSTRING,"test++@","wrong string IT CUF");

        Assertions.assertTrue(CPGBOOLEAN,"wrong boolean CPG CUF");
        Assertions.assertEquals(CPGDOUBLE,0.0002,"wrong double CPG CUF");
        Assertions.assertEquals(CPGFLOAT,0.001256f,"wrong float CPG CUF");
        Assertions.assertEquals(CPGSTRING,"test++@","wrong string CPG CUF");

        Assertions.assertTrue(TSBOOLEAN,"wrong boolean TS CUF");
        Assertions.assertEquals(TSDOUBLE,0.0002,"wrong double TS CUF");
        Assertions.assertEquals(TSFLOAT,0.001256f,"wrong float TS CUF");
        Assertions.assertEquals(TSSTRING,"test++@","wrong string TS CUF");

    }
    @Then("je verifie le jeu de donnee {int} {double} {string} {string}")
    public void je_verifie_le_jeu_de_donnee(Integer int1, Double double1, String string, String string2) {
        Assertions.assertEquals(DSINT,1,"wrong int DS");
        Assertions.assertEquals(DSFLOAT,1.1f,"wrong float DS");
        Assertions.assertTrue(DSBOOLEAN,"wrong boolean DS");
        Assertions.assertEquals(DSSTRING,"test","wrong string DS");
        Assertions.assertEquals(param,"param_not_found","wrong param_not_found");
        Assertions.assertEquals(paramTest,"test","wrong paramTest");

        //vérification paramètres globaux seulement en Devops avec un PEAC approprié
        Assertions.assertEquals(globalInt,1,"wrong global int");
        Assertions.assertEquals(globalFLOAT,1.1f,"wrong global float");
        Assertions.assertEquals(globalSTRING,"test","wrong global string");
        Assertions.assertTrue(globalBOOLEAN,"wrong global boolean");
        Assertions.assertEquals(TCREF,"CT001","wrong global TCREF");
        Assertions.assertEquals(globalres,3,"wrong global int CUF");
        Assertions.assertEquals(DSNAME,"TEST1","wrong global DSNAME");

        Assertions.assertEquals(ITglobalFLOAT,0.001256f,"wrong global float IT");
        Assertions.assertEquals(ITglobalSTRING,"test++@","wrong global string IT");

        Assertions.assertTrue(CPGglobalBOOLEAN,"wrong global boolean CPG");
        Assertions.assertEquals(CPGglobalDOUBLE,0.0002,"wrong global double CPG");

        Assertions.assertEquals(TSglobalFLOAT,0.001256f,"wrong global float TS");
        Assertions.assertEquals(TSglobalSTRING,"test++@","wrong global string TS");
    }

}