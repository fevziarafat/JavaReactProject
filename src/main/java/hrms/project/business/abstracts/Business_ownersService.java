package hrms.project.business.abstracts;

import hrms.project.entities.concretes.Business_owners;

import java.util.List;
import java.util.Optional;

public interface Business_ownersService {
    List<Business_owners> getAll();
    Optional<Business_owners> findById(int Id);
}
