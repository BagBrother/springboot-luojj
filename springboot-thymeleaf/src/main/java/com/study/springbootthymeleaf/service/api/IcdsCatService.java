package com.study.springbootthymeleaf.service.api;

        import com.study.springbootthymeleaf.model.IcdsCat;

        import java.util.List;

public interface IcdsCatService {
    IcdsCat save(IcdsCat icdsCat);

    List<IcdsCat> findList();

    void edit(IcdsCat icdsCat);

    void delete(Integer catId);

    IcdsCat findById(int catId);
}
