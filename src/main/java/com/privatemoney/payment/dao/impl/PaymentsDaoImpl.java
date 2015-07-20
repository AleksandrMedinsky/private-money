package com.privatemoney.payment.dao.impl;

import com.privatemoney.payment.dao.PaymentDao;
import com.privatemoney.payment.Payment;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentsDaoImpl implements PaymentDao {

    @Override
    public boolean makeIncoming(Payment payment) {
        return false;
    }

    @Override
    public boolean makeExpense(Payment payment) {
        return false;
    }
}
