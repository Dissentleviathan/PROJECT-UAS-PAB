package com.if3b.splash_screen;

import java.util.ArrayList;

public class DataIndomaret {
    public static String data[][] = new String[][]{
            {"Indomaret Angkatan 45"," Jl. Angkatan 45 Lorok Pakjo Ilir Barat 1, Lorok Pakjo, Ilir Barat I, Palembang City, South Sumatra 30137","Hours:" +
                    "EveryDay 7AM–10PM","Phone: 0816-500-580","https://www.google.com/maps/uv?pb=!1s0x2e3b75dcd47c9b17%3A0x89dfa454d911e32f!3m1!7e115!4shttps%3A%2F%2Flh5.googleusercontent.com%2Fp%2FAF1QipPdz44WegIZjej5-yWK_Vu4Jd2PBQw3_ZmBzIRX%3Dw130-h87-n-k-no!5sjumlah%20indomaret%20di%20palembang%20-%20Google%20Search!15sCgIgAQ&imagekey=!1e10!2sAF1QipPdz44WegIZjej5-yWK_Vu4Jd2PBQw3_ZmBzIRX&hl=en&sa=X&ved=2ahUKEwifiIeU0fj7AhVKFbcAHSivDWoQ7ZgBKAJ6BAgWEAQ#"}
            ,{"Indomaret Demang Lebar"," Jalan, Demang Lebar Daun, Ilir Barat I, Palembang City, South Sumatra 30137","Hours:" +
            "EveryDay 7AM–10:30PM","Phone: (0711) 5327110","https://www.google.com/maps/uv?pb=!1s0x2e3b75bfadc23967%3A0x3e2b693843e43c74!3m1!7e115!4shttps%3A%2F%2Flh5.googleusercontent.com%2Fp%2FAF1QipP9yTnA4vkdSGHwLpeMvFOg5k130P1rCWbE8uIy%3Dw260-h175-n-k-no!5sjumlah%20indomaret%20di%20palembang%20-%20Google%20Search!15sCgIgAQ&imagekey=!1e10!2sAF1QipP9yTnA4vkdSGHwLpeMvFOg5k130P1rCWbE8uIy&hl=en&sa=X&ved=2ahUKEwjuiM2z0_j7AhUNFLcAHRq3CqAQ7ZgBKAB6BAgXEAI#"}
            ,{"Indomaret Fresh Jend Sudirman 4"," Jl. Jend. Sudirman, Pahlawan, Kec. Kemuning, Kota Palembang, Sumatera Selatan 30129","Hours:" +
            "EveryDay Open 24 hours","Phone: 0816-500-580",""}
    };

    public static ArrayList<ModelIndomaret> ambilDataIndomaret(){
        ArrayList<ModelIndomaret> dataIndomaret = new ArrayList<>();
        for (String[] varData : data) {
            ModelIndomaret model = new ModelIndomaret();
            model.setNama(varData[0]);
            model.setAlamat(varData[1]);
            model.setJamBuka(varData[2]);
            model.setKontak(varData[3]);
            model.setFoto(varData[4]);

            dataIndomaret.add(model);
        }

        return  dataIndomaret;
    }
}
