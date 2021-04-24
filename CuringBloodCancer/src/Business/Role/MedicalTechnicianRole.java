/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.MedicalTechnicianOrganization;
import Business.UserAccount.UserAccount;

import javax.swing.JPanel;
import userinterface.MedicalTechnicianRole.MedicalTechnicianWorkAreaJPanel;

/**
 *
 * @author JKU
 */
public class MedicalTechnicianRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new MedicalTechnicianWorkAreaJPanel(account, (MedicalTechnicianOrganization) organization, enterprise, business, network);
    }
    
}
