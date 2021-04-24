/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.MedicalTechnicianRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author JKU
 */
public class MedicalTechnicianOrganization extends Organization{

    public MedicalTechnicianOrganization() {
        super(Organization.Type.MedicalTechnician.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MedicalTechnicianRole());
        return roles;
    }
     
}