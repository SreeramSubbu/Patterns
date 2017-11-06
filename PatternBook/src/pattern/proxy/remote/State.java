package pattern.proxy.remote;

import java.io.Serializable;

/**
 *
 * @author ramudu
 */
interface State extends Serializable {

    void insertCoin();

    void ejectCoin();

    void pressButton();

    void dispense();

}
