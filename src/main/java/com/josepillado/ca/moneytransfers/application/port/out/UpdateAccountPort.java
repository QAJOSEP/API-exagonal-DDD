package com.josepillado.ca.moneytransfers.application.port.out;

import com.josepillado.ca.moneytransfers.domain.Account;

public interface UpdateAccountPort {

    void update(Account account);
}
