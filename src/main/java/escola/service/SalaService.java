
package escola.service;

import escola.model.Sala;
import escola.repository.SalaRepository;

import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SalaService {

    private final SalaRepository repository;

    public SalaService(SalaRepository repository) {
        this.repository = repository;
    }

    public Sala cadastrar(Sala sala) {

        if (sala.getCodigo() == null ||
            sala.getCodigo().isBlank() ||
            sala.getNome() == null ||
            sala.getNome().isBlank() ||
            sala.getCapacidade() == null ||
            sala.getCapacidade() <= 0) {

            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "Dados invalidos"
            );
        }

        if (repository.existsByCodigo(sala.getCodigo())) {
            throw new ResponseStatusException(
                HttpStatus.CONFLICT,
                "Codigo ja cadastrado"
            );
        }

        sala.setReservada(false);
        return repository.save(sala);
    }

    public List<Sala> listar() {
        return repository.findAll();
    }

    public Sala buscar(Long id) {
        return repository.findById(id)
            .orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Sala nao encontrada"
            ));
    }

    public Sala reservar(Long id) {
        Sala sala = buscar(id);

        if (sala.isReservada()) {
            throw new ResponseStatusException(
                HttpStatus.CONFLICT,
                "Sala ja esta reservada"
            );
        }

        sala.setReservada(true);
        return repository.save(sala);
    }

    public Sala liberar(Long id) {
        Sala sala = buscar(id);

        if (!sala.isReservada()) {
            throw new ResponseStatusException(
                HttpStatus.CONFLICT,
                "Sala ja esta livre"
            );
        }

        sala.setReservada(false);
        return repository.save(sala);
    }

    public void excluir(Long id) {
        Sala sala = buscar(id);

        if (sala.isReservada()) {
            throw new ResponseStatusException(
                HttpStatus.CONFLICT,
                "Nao pode excluir uma sala reservada"
            );
        }

        repository.delete(sala);
    }
}
