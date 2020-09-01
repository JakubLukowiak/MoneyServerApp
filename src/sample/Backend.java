package sample;



public class Backend {

    static String gross_to_net(String gross_string, int income_tax)
    {
        double gross, net_double;
        String net_string;

        gross = Double.valueOf(gross_string);
        net_double = gross * (1-(0.01*income_tax));
        net_double = Math.round(net_double);
        net_string = String.valueOf(net_double);

        return net_string;
    }

}
