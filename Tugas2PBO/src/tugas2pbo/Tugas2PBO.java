package tugas2pbo;


import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import tugas3pbo.*;

public class Tugas2PBO {

    
    public static void main(String[] args) {
        Scanner planet = new Scanner(System.in);
        double rk,  r, tg, r2, tg2, orbitk, rotasik, revolusik;
        double rv, orbitv, rotasiv, revolusiv;
        double rb, orbitb, rotasib, revolusib;
        double rm, orbitm, rotasim, revolusim;
        double rj, orbitj, rotasij, revolusij;
        double rs, orbits, rotasis, revolusis;
        double ru, orbitu, rotasiu, revolusiu;
        double rn, orbitn, rotasin, revolusin;
        float sd;
        System.out.println("MENU:");
        System.out.println("1. BANGUN RUANG");
        System.out.println("2. PLANET");
        System.out.print("PILIH : ");
        int menu = planet.nextInt();
        switch(menu){
            case 1 : System.out.println("*PROGRAM MENGHITUNG KELILING, LUAS PERMUKAAN, DAN VOLUME*");
                   // System.out.println("Masukkan Tinggi = ");
                    Scanner pilihan = new Scanner(System.in);
                    Scanner jari2 = new Scanner(System.in);
                    Scanner tinggi = new Scanner(System.in);
                    Scanner sudut = new Scanner(System.in);
                    Scanner tinggi2 = new Scanner(System.in);
                    Scanner jarikcl = new Scanner(System.in);
                    
                    try{
                        System.out.println("Masukkan Jari-jari = ");
                        r = jari2.nextDouble();
                        if(r<=0){
                            throw new RuntimeException("Data Salah");
                        }
                        System.out.println("Masukkan Jari-jari Kecil = ");
                        r2 = jarikcl.nextDouble();
                        if(r2<=0){
                            throw new RuntimeException("Data Salah");
                        }
                        System.out.println("Masukkan Tinggi = ");
                        tg = tinggi.nextDouble();
                        if(tg<=0){
                            throw new RuntimeException("Data Salah");
                        }
                        System.out.println("Masukkan Tinggi Kecil = ");
                        tg2 = tinggi2.nextDouble();
                        if(tg2<=0){
                            throw new RuntimeException("Data Salah");
                        }
                        System.out.println("Masukkan Sudut = ");
                        sd = sudut.nextFloat();
                        if(sd<=0){
                            throw new RuntimeException("Data Salah");
                        }
                    } catch(RuntimeException a) {
                        System.out.println("Data Tidak Boleh Kurang Dari Samadengan 0, Mohon Ulangi");

                        System.out.println("Masukkan Jari-jari = ");
                        r = jari2.nextDouble();
                        if(r<=0){
                            throw new RuntimeException("Data Salah");
                        }
                        System.out.println("Masukkan Jari-jari Kecil = ");
                        r2 = jarikcl.nextDouble();
                        if(r2<=0){
                            throw new RuntimeException("Data Salah");
                        }
                        System.out.println("Masukkan Tinggi = ");
                        tg = tinggi.nextDouble();
                        if(tg<=0){
                            throw new RuntimeException("Data Salah");
                        }
                        System.out.println("Masukkan Tinggi Kecil = ");
                        tg2 = tinggi2.nextDouble();
                        if(tg2<=0){
                            throw new RuntimeException("Data Salah");
                        }
                        System.out.println("Masukkan Sudut = ");
                        sd = sudut.nextFloat();
                        if(sd<=0){
                            throw new RuntimeException("Data Salah");
                        }
                    }
                    Lingkaran l = new Lingkaran(r); 
                    Tabung t = new Tabung(r, tg);
                    Busur b = new Busur(r, sd);
                    Bola bl = new Bola(r);
                    Kerucut k = new Kerucut(r, tg);
                    KerucutTerpancung kt = new KerucutTerpancung(r, tg, r2, tg2);
                    Juring2D j = new Juring2D(r, sd);
                    Tembereng2D tb = new Tembereng2D(r, sd);
                    Juring3D jr = new Juring3D(r, sd, tg);
                    Tembereng3D tbr = new Tembereng3D(r, sd,tg);


                    System.out.println("========MENU=========");
                    System.out.println("1. Lingkaran");
                    System.out.println("2. Tabung");
                    System.out.println("3. Kerucut");
                    System.out.println("4. Bola");
                    System.out.println("Pilih = ");
                    int pilih = pilihan.nextInt();

                    switch(pilih){
                        case 1 : System.out.println("LINGKARAN");
                                l.Luas();
                                System.out.println("Luas Lingkaran : "+l.luasling);
                                l.keliling();
                                j.Luas();
                                tb.Luas();
                                break;
                        case 2 : System.out.println("TABUNG");
                                t.Luas();
                                t.volume();
                                break;
                        case 3 : System.out.println("KERUCUT");
                                k.Luas();
                                k.Volume();
                                System.out.println("Volume Kerucut : "+ k.volume_kerucut);
                                kt.Luas();
                                kt.VolumeTerpancung();
                                break;
                        case 4 : System.out.println("BOLA");
                                bl.Luas();
                                System.out.println("Luas Bola = "+ bl.luasBola);
                                bl.volume();
                                System.out.println("Volume Bola "+ bl.volumeBola);
                                bl.Keliling();            
                                System.out.println("Keliling Bola "+ bl.kelBola);
                                jr.Luas();
                                tbr.Luas();
                                break;
                    }
                    break;
            case 2 : System.out.println("1.PLANET MERKURIUS");
                     System.out.print("Masukkan Jari-jari : ");
                     rk = planet.nextDouble();
                     System.out.print("Masukkan Panjang Lintasan revolusi / orbit : ");
                     orbitk = planet.nextDouble();
                     System.out.print("Masukkan Kala Rotasi :");
                     rotasik = planet.nextDouble();
                     System.out.print("Masukkan Kala Revolusi :");
                     revolusik = planet.nextDouble();
                     System.out.println("2.PLANET VENUS");
                     System.out.print("Masukkan Jari-jari : ");
                     rv = planet.nextDouble();
                     System.out.print("Masukkan Panjang Lintasan revolusi / orbit : ");
                     orbitv = planet.nextDouble();
                     System.out.print("Masukkan Kala Rotasi :");
                     rotasiv = planet.nextDouble();
                     System.out.print("Masukkan Kala Revolusi :");
                     revolusiv = planet.nextDouble();
                     System.out.println("3.PLANET BUMI");
                     System.out.print("Masukkan Jari-jari : ");
                     rb = planet.nextDouble();
                     System.out.print("Masukkan Panjang Lintasan revolusi / orbit : ");
                     orbitb = planet.nextDouble();
                     System.out.print("Masukkan Kala Rotasi :");
                     rotasib = planet.nextDouble();
                     System.out.print("Masukkan Kala Revolusi :");
                     revolusib = planet.nextDouble();
                     System.out.println("4.PLANET MARS");
                     System.out.print("Masukkan Jari-jari : ");
                     rm = planet.nextDouble();
                     System.out.print("Masukkan Panjang Lintasan revolusi / orbit : ");
                     orbitm = planet.nextDouble();
                     System.out.print("Masukkan Kala Rotasi :");
                     rotasim = planet.nextDouble();
                     System.out.print("Masukkan Kala Revolusi :");
                     revolusim = planet.nextDouble();
                     System.out.println("5.PLANET JUPITER");
                     System.out.print("Masukkan Jari-jari : ");
                     rj = planet.nextDouble();
                     System.out.print("Masukkan Panjang Lintasan revolusi / orbit : ");
                     orbitj = planet.nextDouble();
                     System.out.print("Masukkan Kala Rotasi :");
                     rotasij = planet.nextDouble();
                     System.out.print("Masukkan Kala Revolusi :");
                     revolusij = planet.nextDouble();
                     System.out.println("6.PLANET SATURNUS");
                     System.out.print("Masukkan Jari-jari : ");
                     rs = planet.nextDouble();
                     System.out.print("Masukkan Panjang Lintasan revolusi / orbit : ");
                     orbits = planet.nextDouble();
                     System.out.print("Masukkan Kala Rotasi :");
                     rotasis = planet.nextDouble();
                     System.out.print("Masukkan Kala Revolusi :");
                     revolusis = planet.nextDouble();
                     System.out.println("7.PLANET URANUS");
                     System.out.print("Masukkan Jari-jari : ");
                     ru = planet.nextDouble();
                     System.out.print("Masukkan Panjang Lintasan revolusi / orbit : ");
                     orbitu = planet.nextDouble();
                     System.out.print("Masukkan Kala Rotasi :");
                     rotasiu = planet.nextDouble();
                     System.out.print("Masukkan Kala Revolusi :");
                     revolusiu = planet.nextDouble();
                     System.out.println("8.PLANET NEPTUNUS");
                     System.out.print("Masukkan Jari-jari : ");
                     rn = planet.nextDouble();
                     System.out.print("Masukkan Panjang Lintasan revolusi / orbit : ");
                     orbitn = planet.nextDouble();
                     System.out.print("Masukkan Kala Rotasi :");
                     rotasin = planet.nextDouble();
                     System.out.print("Masukkan Kala Revolusi :");
                     revolusin = planet.nextDouble();
                     Lingkaran ling = new Lingkaran(rk); 
                     Bola bola = new Bola(rk);
                     Merkurius mk = new Merkurius(rk,orbitk,rotasik,revolusik);
                     Thread th = new Thread(mk);
                     th.start();
                     Lingkaran apa = new Lingkaran(rv); 
                     Bola bo = new Bola(rv);
                     Venus v = new Venus(rv,orbitv,rotasiv,revolusiv);
                     Thread thv = new Thread(v);
                     thv.start();
                     Lingkaran aha = new Lingkaran(rb); 
                     Bola bb = new Bola(rb);
                     Bumi bum = new Bumi(rb,orbitb,rotasib,revolusib);
                     Thread thb = new Thread(bum);
                     thb.start();
                     Lingkaran mars = new Lingkaran(rm); 
                     Bola bm = new Bola(rm);
                     Mars mrs = new Mars(rm,orbitm,rotasim,revolusim);
                     Thread thm = new Thread(mrs);
                     thm.start();
                     Lingkaran jpt = new Lingkaran(rj); 
                     Bola bj = new Bola(rj);
                     Jupiter jupt = new Jupiter(rj,orbitj,rotasij,revolusij);
                     Thread thj = new Thread(jupt);
                     thj.start();
                     Lingkaran satur = new Lingkaran(rs); 
                     Bola bs = new Bola(rs);
                     Saturnus str = new Saturnus(rs,orbits,rotasis,revolusis);
                     Thread ths = new Thread(str);
                     ths.start();
                     Lingkaran urs = new Lingkaran(ru); 
                     Bola bu = new Bola(ru);
                     Uranus urn = new Uranus(ru,orbitu,rotasiu,revolusiu);
                     Thread thu = new Thread(urn);
                     thu.start();
                     Lingkaran nept = new Lingkaran(rn); 
                     Bola bn = new Bola(rn);
                     Neptunus npt = new Neptunus(rn,orbitn,rotasin,revolusin);
                     Thread thn = new Thread(npt);
                     thn.start();
                     
                     try {
                        Thread.sleep(1000);
                        IlustrasiVolume iv = new IlustrasiVolume();
//                             iv.jari2(rk, rv, rb, rm, rj, rs, ru, rn);
//                             iv.pnjng(orbitk, orbitv, orbitb, orbitm, orbitj, orbits, orbitu, orbitn);
                        iv.setVisible(true);
                        JFrame myFrame = new JFrame("Hello");
                        myFrame.add(iv);
                        myFrame.pack();
                        myFrame.setVisible(true);
                        myFrame.setSize(800, 800);
                        iv.init();
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Tugas2PBO.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        SwingUtilities.invokeLater(new Runnable() {
                         @Override
                         public void run() {
                            JFrame frame = new JFrame("Ilustrasi Pergerakan");
                            frame.setContentPane(new IlustrasiPergerakan(rk, rv, rb, rm, rj, rs, ru, rn));  
                            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            frame.pack();
                            frame.setLocationRelativeTo(null); 
                            frame.setVisible(true); 
                            //IlustrasiPergerakan n = new IlustrasiPergerakan();
                         }
                      });
                        
                    break;
        }
        
       
    }
}
