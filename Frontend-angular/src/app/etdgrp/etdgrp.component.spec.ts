import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EtdgrpComponent } from './etdgrp.component';

describe('EtdgrpComponent', () => {
  let component: EtdgrpComponent;
  let fixture: ComponentFixture<EtdgrpComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EtdgrpComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EtdgrpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
