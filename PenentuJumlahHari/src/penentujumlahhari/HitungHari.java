/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penentujumlahhari;

/**
 *
 * @author iwana
 */
public class HitungHari extends PenentuJumlahHari{

    public int hitung(int tahun, String bulan) {
        int jumlahHari;

        switch (bulan) {
            case "Januari": case "Maret": case "Mei": case "Juli": 
            case "Agustus": case "Oktober": case "Desember":
                jumlahHari = 31;
                break;
            case "April": case "Juni": case "September": case "November":
                jumlahHari = 30;
                break;
            case "Februari":
                // Cek apakah tahun kabisat atau bukan
                if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                    jumlahHari = 29; // Tahun kabisat
                } else {
                    jumlahHari = 28; // Bukan tahun kabisat
                }
                break;
            default:
                System.out.println("Bulan tidak valid.");
                return 0;
        }
        
        return jumlahHari;
    }

    
}