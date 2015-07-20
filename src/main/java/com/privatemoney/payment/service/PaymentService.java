package com.privatemoney.payment.service;

import com.privatemoney.payment.dao.PaymentDao;
import com.privatemoney.payment.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    public PaymentDao getPaymentDao() {
        return paymentDao;
    }

    public void setPaymentDao(PaymentDao paymentDao) {
        this.paymentDao = paymentDao;
    }

    public boolean makeIncoming(Payment payment){
        return paymentDao.makeIncoming(payment);
    }

    public boolean makeExpense(Payment payment){
        return paymentDao.makeExpense(payment);
    }
}
