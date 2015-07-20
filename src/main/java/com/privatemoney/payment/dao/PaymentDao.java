package com.privatemoney.payment.dao;

import com.privatemoney.payment.Payment;

public interface PaymentDao {
    boolean makeIncoming(Payment payment);
    boolean makeExpense(Payment payment);
}
