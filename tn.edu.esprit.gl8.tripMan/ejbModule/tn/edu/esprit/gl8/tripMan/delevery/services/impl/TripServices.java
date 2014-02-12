/*package tn.edu.esprit.gl8.tripMan.delevery.services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.edu.esprit.gl8.tripMan.delevery.domain.Organizer;
import tn.edu.esprit.gl8.tripMan.delevery.domain.Trip;
import tn.edu.esprit.gl8.tripMan.delevery.services.interfaces.TripServicesLocal;
import tn.edu.esprit.gl8.tripMan.delevery.services.interfaces.TripServicesRemote;

/**
 * Session Bean implementation class TripServices
 */
/*
@Stateless
public class TripServices implements TripServicesRemote, TripServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
/*
	public TripServices() {

	}

	@Override
	public void addTrip(Trip trip) {
		entityManager.persist(trip);

	}

	@Override
	public Trip findTripById(int idTrip) {
		return entityManager.find(Trip.class, idTrip);
	}

	@Override
	public void updateTrip(Trip trip) {
		entityManager.merge(trip);

	}

	@Override
	public void deleteTrip(int idTrip) {
		entityManager.remove(findTripById(idTrip));

	}

	@Override
	public List<Trip> findAllTrips() {
		String jpql = "select t from Trip t";
		Query query = entityManager.createQuery(jpql);
		List<Trip> tripsLoaded = query.getResultList();
		return tripsLoaded;
	}

	@Override
	public void deleteTripByRamzi(Trip trip) {
		entityManager.remove(entityManager.merge(trip));

	}

	@Override
	public void organizeTrip(Organizer organizer, Trip trip) {
		trip.setOrganizer(organizer);
		entityManager.persist(trip);

	}

}*/
