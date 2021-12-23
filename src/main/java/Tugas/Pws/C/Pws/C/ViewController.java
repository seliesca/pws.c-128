/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas.Pws.C.Pws.C;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import static javax.management.Query.value;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author User
 */
@Controller
public class ViewController {
    
    @RequestMapping("/tabel")
    public String getTabel (Model model, HttpServletRequest cari){
        
        String data_mahasiswa = cari.getParameter("data");
        String data_ketemu="";
        List<String> buffer = new ArrayList<>();
        
        
        
        ArrayList<List<String>> tabel_datamahasiswa = new ArrayList<>(); 
        
        
        tabel_datamahasiswa.add(Arrays.asList("")); 
        
      
        
        return "viewTabel";
        
    }
    
    /**
     *
     * @return
     */
    @RequestMapping("/nim")
    @ResponseBody
    public ArrayList<String> getNim(){
      
        ArrayList<String> nim= new ArrayList<>();
        
        nim.add("124");
        nim.add("129");
        nim.add("120");
        nim.add("122");
        nim.add("127");
        nim.add("120");
        nim.add("174");
        nim.add("140");
        nim.add("114");
        nim.add("192");
        
        return nim;
        
    }
    @RequestMapping("/nama")
    @ResponseBody
    public ArrayList<String> getNama(){
        
        ArrayList<String> nama= new ArrayList<>(); 
        
        nama.add("Seliesca");
        nama.add("Whidya");
        nama.add("Sels");
        nama.add("Tata");
        nama.add("Feli");
        nama.add("Fiqah");
        nama.add("Qilla");
        nama.add("Vallen");
        nama.add("Sabira");
        nama.add("Alzipco");
        
        return nama;
    }
    
     @RequestMapping("/alamat")
    @ResponseBody
    public ArrayList<String> getAlamat(){
        
         ArrayList<String> alamat= new ArrayList<>();
                 
         alamat.add("Bengkulu");
         alamat.add("Seluma");
         alamat.add("Padang Harapan");
         alamat.add("Yogyakarta");
         alamat.add("Bantul");
         alamat.add("Sleman");
         alamat.add("KulonProgo");
         alamat.add("Palembang");
         alamat.add("Baturaja");
         alamat.add("Bali");
         
         return alamat;
                 
    }
      
     @RequestMapping("/prodi")
    @ResponseBody
    public ArrayList<String> getProdi(){
        
        ArrayList<String> prodi= new ArrayList<>();
        
        prodi.add("Teknik Sipil");
        prodi.add("Teknik Mesin");
        prodi.add("Agroteknologi");
        prodi.add("Manajemen");
        prodi.add("Kedokteran");
        prodi.add("Keperawatan");
        prodi.add("Hukum");
        prodi.add("Ilmu Pemerintahan");
        prodi.add("Teknik Informatika");
        prodi.add("Teknik Elektro");
        
        return prodi;
    }
    
    @CrossOrigin
    @GetMapping(value"datamahasiswa", produces = {
        MediaType.APPLICATION_JSON_VALUE
    } 
            
    /**
     *
     * @return
     */
    @/*ResponseBody*/
    public HashMap<String, String> getData(){
    
    HashMap<String, String> map = new HashMap<>(){
    map.put ("nama","Alzipco");
    map.put ("alamat","Bali");
    map.put ("nim","192");
    map.put ("prodi","Teknik Elektro");
    
    return map;
    
}
