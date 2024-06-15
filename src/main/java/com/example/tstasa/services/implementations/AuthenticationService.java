package com.example.tstasa.services.implementations;

import com.example.tstasa.dtos.AuthenticationRequest;
import com.example.tstasa.dtos.AuthenticationResponse;
import com.example.tstasa.dtos.RegisterRequest;

public interface AuthenticationService {
    AuthenticationResponse register(RegisterRequest request);
    AuthenticationResponse auth(AuthenticationRequest request);
}
