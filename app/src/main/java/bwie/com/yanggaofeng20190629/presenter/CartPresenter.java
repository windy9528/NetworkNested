package bwie.com.yanggaofeng20190629.presenter;

import bwie.com.yanggaofeng20190629.common.BasePresenter;
import bwie.com.yanggaofeng20190629.common.ImplView;
import bwie.com.yanggaofeng20190629.common.MyApp;
import bwie.com.yanggaofeng20190629.model.ApiServer;
import io.reactivex.Observable;

/**
 * date:2019/6/29
 * name:windy
 * function:
 */
public class CartPresenter extends BasePresenter {

    public CartPresenter(ImplView implView) {
        super(implView);
    }

    @Override
    protected Observable getModel(ApiServer apiServer, Object... args) {
        return apiServer.showCart(
                MyApp.getUserInfo().getString("userId", ""),
                MyApp.getUserInfo().getString("sessionId", "")
        );
    }
}
