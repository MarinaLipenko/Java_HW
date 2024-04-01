package repository;

import org.springframework.stereotype.Repository;
import model.Operation;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StorageOperationRepository {
    private List<Operation> list = new ArrayList<>();

    public void add(Operation o) {
        list.add(o);
    }

    public List<Operation> getAll() {
        return list;
    }

    public void setList(List<Operation> list) {
        this.list = list;
    }

}