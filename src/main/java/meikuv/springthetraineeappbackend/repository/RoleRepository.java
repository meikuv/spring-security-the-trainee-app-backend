package meikuv.springthetraineeappbackend.repository;

import meikuv.springthetraineeappbackend.models.ERole;
import meikuv.springthetraineeappbackend.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRole(ERole role);
}
