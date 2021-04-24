/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.HLA.HLACount;
import Business.HLA.PersonHLA;
import Business.Role.DoctorRole;
import Business.Role.BoneMarrowBankCoordinatorRole;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author JKU
 */
public class BoneMarrowBankOrganization extends Organization{

    HLACount inventory;
    
    public BoneMarrowBankOrganization() {
        super(Organization.BoneMarrowBankType.BoneMarrowBank.getValue());
        inventory = new HLACount();
        PersonHLA h = new PersonHLA();
        h.updateHLAlist("HLA_A,HLA_B");
        inventory.HLACountAdd(h,6);
        h = new PersonHLA();
        h.updateHLAlist("HLA_A");
        inventory.HLACountAdd(h,5);
        h = new PersonHLA();
        h.updateHLAlist("HLA_A,HLA_B,HLA_C");
        inventory.HLACountAdd(h,7);
    }

    public HLACount getInventory() {
        return inventory;
    }
    
    public HashMap<String, Integer> getInventoryData() {
        return this.getInventory().getHlaComboCounts();
    }

    public void setInventory(HLACount inventory) {
        this.inventory = inventory;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BoneMarrowBankCoordinatorRole());
        return roles;
    }
     
}