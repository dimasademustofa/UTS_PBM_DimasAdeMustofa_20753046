package com.example.rukun_rukunsholat;

import java.util.ArrayList;

public class DataRukun {
    private static final String[] urutanRukun ={
            "1. Berdiri Bagi Yang Mampu",
            "2. Niat Sholat",
            "3. Takbiratul Ihram",
            "4. Membaca Surah Al-Fatihah",
            "5. Rukuk dan Thuma'ninah",
            "6. I'tidal dan Thuma'ninah",
            "7. Sujud Dua Kali dan Thuma'ninah",
            "8. Duduk di Antara Dua Sujud dan Thuma'ninah",
            "9. Duduk Tasyahud dan Tasyahud Akhir",
            "10. Membaca Tasyahud Akhir",
            "11. Bershalawat Kepada Nabi pada Tasyahud Akhir",
            "12. Salam",
            "13. Tertib (Berurutan)"

    };

    private static String detailRukun[] = {

            "Bagi yang tidak mampu atau memiliki kekurangan fisik dan penyakit tertentu yang membuatnya tidak sanggup berdiri, maka bisa lakukan dengan dukuk. Jika masih tidak mampu, bisa dilakukan dengan cara berbaring. Sambil Mata mengarah ke tempat sujud. ",
            "Niat adalah bermaksud melakukan sesuatu sekalipun hanya dalam hati, hal tersebut sudah termasuk niat tanpa harus melafalzkannya. Dan berniat melakukan salat hanya karena Allah SWT semata.",
            "Mengucapkan Takbir “Allahu akbar” ketika mengawali ibadah sholat, dan ketika seseorang sudah melakukan takbiratul ihram, pertanda bahwa tidak boleh melakukan hal-hal diluar sholat yang berarti seseorang sudah masuk dalam ibadah sholat. Sehingga harus diam dan hanya mengucapkan bacaan bacaan sholat yang akan dibaca nantinya.",
            "Dimana “Bismillâhirrahmânirrahîm” merupakan bagian ayatnya. Terdapat beberapa pendapat berbeda Imam Syafi’i berpendapat bahwa Basmalah ikut dibaca dan dikeraskan oleh imam, Imam Ahmad berpendapat dibaca tetapi lirih atau tidak dikeraskan dan Imam Malik sama sekali tidak membaca basmalah.",
            "Badan turun dan dibungkukkan sambil membaca doa saat Ruku’. Dilakukan dengan tenang dan ikhlas atau tidak terburu-buru.",
            "Selesai ruku', terus bangkitlah tegak dengan mengangkat kedua belah tangan setentang telinga. Pada waktu berdiri tegak membaca do’a (i'tidal).",
            "Setelah i'tidal terus sujud (tersungkur kebumi) dengan meletakkan dahi kebumi, dan ketika turun seraya membaca “Allahu akbar”.",
            "Setelah sujud kemudian duduk serta membaca Do’a. \n" +
                    "\nNabi Muhammad Shallallahu ‘alaihi wa sallam bersabda,\n" +
                    "“Kemudian, sujudlah dan thuma’ninalah saat sujud. Lalu, bangkitlah dari sujud dan thuma’ninalah saat duduk. Kemudian, sujudlah kembali dan thuma’ninah saat sujud.” ",
            "Duduk untuk tasyahhud akhir\n" +
                    "\nRasulullah Shallallahu ‘alaihi wa sallam bersabda,\n" +
                    "“Apabila salah seorang antara kalian duduk (tasyahud) dalam shalat, ucapkanlah “at tahiyatu lillah …”. “(HR. Bukhari no. 831 dan Muslim no. 402, dari Ibnu Mas’ud).",
            "Membaca doa tasyahhud akhir\n" +
                    "\nAdapun bacaan tasyahud adalah sebagai berikut.\n" +
                    "“At tahiyaatu lillah wash sholaatu wath thoyyibaat. Assalaamu ‘alaika ayyuhan nabiyyu wa rahmatullahi wa barakaatuh. Assalaamu ‘alaina wa ‘ala ‘ibadhillahish sholihin. Asyhadu an laa ilaha illallah wa asyhadu anna muhammadan ‘abduhu wa rosuluh.”",
            "Membaca shalawat pada Nabi Sallawahualaihiwasalam saat Tasyahhud Akhir\n" +
                    "\nAdapun shalawat yang paling bagus adalah berikut ini.\n" +
                    "Allahumma sholli ‘ala Muhammad wa ‘ala aali Muhammad, kamaa shollaita ‘alaa ibraahim wa ‘alaa aali Ibrahim, innaka hamiidun majiid. Allahumma baarik a’la Muhammad wa a’laa ali Muhammad, kamaa baarakta ‘ala Ibraahiim wa a’la aali Ibrahim innaka hamidun majiid. [HR. Bukhari no. 4797 dan Muslim no. 409, dari Ka’ab bin ‘Ujroh.].",
            "Selesai tahyat akhir, kemudian salam dengan menengok kekanan dan kekiri.",
            "Yakni mengurutkan rukun-rukun sesuai apa yang telah dituturkan."
    };

    private static final int[] imageRukun = {
            R.drawable.berdiri,
            R.drawable.niat,
            R.drawable.takbir,
            R.drawable.membaca_al_fatihah,
            R.drawable.ruku,
            R.drawable.itidal,
            R.drawable.sujud,
            R.drawable.duduk_antara_dua_sujud,
            R.drawable.duduk_tasyahud_akhir,
            R.drawable.membaca_tasyahud_akhir,
            R.drawable.membaca_shalawat_nabi,
            R.drawable.salam,
            R.drawable.tertib
    };

    static ArrayList<Rukun> getListData() {
        ArrayList<Rukun> list = new ArrayList<>();
        for (int position = 0; position < urutanRukun.length; position++) {
            Rukun rukun = new Rukun();
            rukun.setNama(urutanRukun[position]);
            rukun.setDetail(detailRukun[position]);
            rukun.setPhoto(imageRukun[position]);
            list.add(rukun);
        }
        return list;
    }
}
