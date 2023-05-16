package vn.edu.hcmuaf.fit.laptrinhweb.dao;

import vn.edu.hcmuaf.fit.laptrinhweb.model.Post;
import vn.edu.hcmuaf.fit.laptrinhweb.paging.IPageAble;

import java.util.List;

public interface IPostDAO extends  IGenericDAO<Post>{
    List<Post> findAll();
    Long delete(String id);
    Long add(Post post);
    Long update(String id,Post post);
    List<Post> findAll(IPageAble pageAble,String text);
    Post findById(String id);
    int total();
}
