package id.web.rifki.recyclerviewappfix;

import java.util.ArrayList;


public class MahasiswaData {
    private static String[] mahasiswaNama = {
            "Rifki Tia Bayu Jaya",
            "Mega Restu Mirantika",
            "Wiwin",
            "Yulianti",
    };

    private static String[] mahasiswaNim = {
            "311710594",
            "311710003",
            "311710112",
            "311710291",
    };

    private static String[] mahasiswaHp = {
            "0876-7867-3456",
            "0857-9493-2912",
            "0896-8857-1302",
            "0858-6009-6469",
    };

    private static int[] mahasiswaImage = {
            R.drawable.rifki,
            R.drawable.mega,
            R.drawable.wiwin,
            R.drawable.lia,
    };

    static ArrayList<Mahasiswa> getListData() {
        ArrayList<Mahasiswa> list = new ArrayList<>();
        for (int position =0; position < mahasiswaNama.length; position++) {
            Mahasiswa mahasiswa = new Mahasiswa();
            mahasiswa.setNama(mahasiswaNama[position]);
            mahasiswa.setNim(mahasiswaNim[position]);
            mahasiswa.setPhoto(mahasiswaImage[position]);
            mahasiswa.setNoHp(mahasiswaHp[position]);
            list.add(mahasiswa);
        }
        return list;
    }
}