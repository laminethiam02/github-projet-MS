package sn.edu.ugb.curriculum.service;

import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import sn.edu.ugb.curriculum.service.dto.NiveauDTO;

/**
 * Service Interface for managing {@link sn.edu.ugb.curriculum.domain.Niveau}.
 */
public interface NiveauService {
    /**
     * Save a niveau.
     *
     * @param niveauDTO the entity to save.
     * @return the persisted entity.
     */
    NiveauDTO save(NiveauDTO niveauDTO);

    /**
     * Updates a niveau.
     *
     * @param niveauDTO the entity to update.
     * @return the persisted entity.
     */
    NiveauDTO update(NiveauDTO niveauDTO);

    /**
     * Partially updates a niveau.
     *
     * @param niveauDTO the entity to update partially.
     * @return the persisted entity.
     */
    Optional<NiveauDTO> partialUpdate(NiveauDTO niveauDTO);

    /**
     * Get all the niveaus.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<NiveauDTO> findAll(Pageable pageable);

    /**
     * Get the "id" niveau.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<NiveauDTO> findOne(Long id);

    /**
     * Delete the "id" niveau.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
