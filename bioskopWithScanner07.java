import java.util.Scanner;

public class bioskopWithScanner07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\n---Menu---");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Daftar Penonton: ");
            System.out.println("3. Exit");
            System.out.print("Pilih dari slah satu menu (1/2/3): ");
            int Menu = input.nextInt();
            input.nextLine();

            if (Menu == 1){
                System.out.print("Masukkan nama: ");
                nama = input.nextLine();
                System.out.print("Masukkan baris:");
                baris = input.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = input.nextInt();
                input.nextLine();

                if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2){
                    penonton[baris-1] [kolom-1] = nama;
                    System.out.println("Selamat anda telah mendapatkan kursi. ");
                    }else{
                        System.out.println("Mohon maaf, kursi yang anda pilih telah terisi, mohon pilih kembali kursi yang masih kosong. ");
                    }
                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = input.nextLine();
                    if (next.equalsIgnoreCase("n")){
                        break;
                    } 
                    }else if (Menu== 2) {
                        System.out.println("Daftar Penonton");
                        for(int i = 0; i < 4; i++){
                            for (int j = 0; j < 2; j++){
                                String namaPenonton = penonton[i][j];
                                if (namaPenonton != null){
                                    System.out.println("baris" + (i +1) + ", kolom" + (j+i) + ":" + namaPenonton);
                                }else {
                                    System.out.println("baris" + (i + 1) + ", kolom " +(j+i) + ": ***");
                                }
                            }
                        }
                    } else if (Menu == 3){
                        System.out.println("Terimakasih, Program telah usai. ");
                        break;
                    }else{
                        System.out.println("Pilihan tidak valid. Silahkan pilih menu lainnya yang sesuai.");
                    }
                    }
                    }
                }
            