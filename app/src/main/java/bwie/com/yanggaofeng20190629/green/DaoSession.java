package bwie.com.yanggaofeng20190629.green;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import bwie.com.yanggaofeng20190629.entity.CartBean;

import bwie.com.yanggaofeng20190629.green.CartBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig cartBeanDaoConfig;

    private final CartBeanDao cartBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        cartBeanDaoConfig = daoConfigMap.get(CartBeanDao.class).clone();
        cartBeanDaoConfig.initIdentityScope(type);

        cartBeanDao = new CartBeanDao(cartBeanDaoConfig, this);

        registerDao(CartBean.class, cartBeanDao);
    }
    
    public void clear() {
        cartBeanDaoConfig.clearIdentityScope();
    }

    public CartBeanDao getCartBeanDao() {
        return cartBeanDao;
    }

}
