package com.demo.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import javax.validation.constraints.Null;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class DummyServiceTest {

    @Mock
    DummyService dummyService;

    @Before
    public void setup() {
    }

    @Test()
    public void getDummyService() {
        DummyService dummyService = mock(DummyService.class);
        /*doNothing().when(dummyService.getDummyService()).thenThrow(new NullPointerException())
                .thenThrow(new NullPointerException())
                .thenThrow(new NullPointerException()).thenReturn();*/
//        dummyService.getDummyService();
//        dummyService.getDummyService();
//        dummyService.getDummyService();
//        verify(dummyService, times(3)).getDummyService();
    }
}