package com.hh.dome.FactoeyDesign;

/**
 * @author chenguoku
 * @version 1.0.0
 * @ClassName InlandPaymentFactory.java
 * @Description TODO
 * @createTime 2020年02月26日 19:42:00
 */
public class InlandPaymentFactory {

    public AlipayPayment getAlipayPayment() {
        return new AlipayPayment();
    }

    public UnionpayPayment getUnionpayPayment() {
        return new UnionpayPayment();
    }

    public WeChatPayment getWeChatPayment() {
        return new WeChatPayment();
    }

}
