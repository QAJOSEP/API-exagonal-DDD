package com.josepillado.ca.moneytransfers.application.port.out;

import com.josepillado.ca.moneytransfers.domain.Account;

public interface LoadAccountPort {
    Account load(Long id);
}
