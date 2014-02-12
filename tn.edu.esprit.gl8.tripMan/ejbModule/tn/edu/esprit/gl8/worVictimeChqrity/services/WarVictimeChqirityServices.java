package tn.edu.esprit.gl8.worVictimeChqrity.services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.xml.registry.infomodel.User;

/**
 * Session Bean implementation class WarVictimeChqirityServices
 */
@Stateless
@LocalBean
public class WarVictimeChqirityServices implements
		WarVictimeChqirityServicesRemote, WarVictimeChqirityServicesLocal {

	/**
	 * Default constructor.
	 */
	@PersistenceContext
	private EntityManager entityManager;

	public WarVictimeChqirityServices() {
		// TODO Auto-generated constructor stub

	}

	@Override
	public void addUser(User user) {
		entityManager.persist(user);

	}

	@Override
	public void updateUser(User user) {
		entityManager.merge(user);

	}

	@Override
	public void deleteUser(User user) {
		entityManager.remove(user);

	}

}
