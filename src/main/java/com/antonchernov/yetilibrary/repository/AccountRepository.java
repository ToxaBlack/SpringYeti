package com.antonchernov.yetilibrary.repository;

import com.antonchernov.yetilibrary.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by anton.charnou on 21.03.2016.
 */
public interface AccountRepository extends MongoRepository<Account, Long> {
    Account findByUsername(String username);
}
