/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import java.util.ArrayList;

/**
 *
 * @author JKU
 */
public class DonorRequestDirectory {
    
    
    private ArrayList<DonorRequest> donorRequestList;

    public ArrayList<DonorRequest> getDonorRequestList() {return donorRequestList;}
    public void setDonorRequestList(ArrayList<DonorRequest> donorRequestList) {this.donorRequestList = donorRequestList;}
    
    public DonorRequestDirectory(){
        donorRequestList = new ArrayList<DonorRequest>();
    }
    
    public DonorRequest addDonorRequest(DonorRequest donorRequest)
    {
        donorRequestList.add(donorRequest);
        return donorRequest;
    }
    public DonorRequest removeDonorRequest(DonorRequest donorReq)
    {
        //DonorRequest donorRequest = new DonorRequest();
        //this.donor = donor
        donorRequestList.remove(donorReq);
        //return donorRequest;
        return null;
    }
    
    
    
    
    
    
}
