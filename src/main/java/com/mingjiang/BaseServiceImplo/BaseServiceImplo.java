package com.mingjiang.BaseServiceImplo;

import com.mingjiang.BaseService.BaseService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.core.ResolvableType;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/12/28.
 */
@Repository
public class BaseServiceImplo<T> implements BaseService<T>{
    @Resource
    private SqlSessionFactory sqlSessionFactory;
    private Class<?>clazz=null;
    public  BaseServiceImplo(){
       clazz =ResolvableType.forClass( this.getClass()).as(BaseServiceImplo.class).getGeneric(0).resolve();
    }
    private final String path = "com.mingjiang.mapper.";
    private String getMethodPath(String methodType){
        return path + clazz.getSimpleName() + "Mapper." + methodType;
    }
    protected SqlSession getSession(){
        return  sqlSessionFactory.openSession();
    }
    public void save(T entity) {
        getSession().insert(getMethodPath("save"), entity);
    }

    public void delete(long id) {
        getSession().insert(getMethodPath("delete"), id);
    }

    public void update(T entity) {
        getSession().insert(getMethodPath("update"), entity);
    }

    public T getById(long id) {
        return  getSession().selectOne(getMethodPath("getById"), id);
    }

    public List<T> getByIds(long[] ids) {
        return getSession().selectList(getMethodPath("getByIds"), ids);
    }

    public List<T> findAll() {
        return null;
    }
}


