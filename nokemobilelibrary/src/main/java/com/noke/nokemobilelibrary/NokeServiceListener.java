package com.noke.nokemobilelibrary;

/**
 * Created by Spencer on 1/19/18.
 */

public interface NokeServiceListener  {

    void onNokeDiscovered(NokeDevice noke);

    void onNokeConnecting(NokeDevice noke);

    void onNokeConnected(NokeDevice noke);

    void onNokeDisconnected(NokeDevice noke);

    void onError(NokeDevice noke, int error);
}
