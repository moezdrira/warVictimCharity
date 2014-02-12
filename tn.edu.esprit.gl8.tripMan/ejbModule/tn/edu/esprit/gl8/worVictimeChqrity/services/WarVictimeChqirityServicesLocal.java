package tn.edu.esprit.gl8.worVictimeChqrity.services;

import javax.ejb.Local;
import javax.xml.registry.infomodel.User;

@Local
public interface WarVictimeChqirityServicesLocal {
	public void addUser(User user);

	public void updateUser(User user);

	public void deleteUser(User user);

}
