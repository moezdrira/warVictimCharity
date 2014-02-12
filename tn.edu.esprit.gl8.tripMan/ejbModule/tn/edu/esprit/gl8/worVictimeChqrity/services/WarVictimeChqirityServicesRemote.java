package tn.edu.esprit.gl8.worVictimeChqrity.services;

import javax.ejb.Remote;
import javax.xml.registry.infomodel.User;

@Remote
public interface WarVictimeChqirityServicesRemote {
	public void addUser(User user);

	public void updateUser(User user);

	public void deleteUser(User user);

}
