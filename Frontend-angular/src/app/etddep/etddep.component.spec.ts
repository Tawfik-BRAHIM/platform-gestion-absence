import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EtddepComponent } from './etddep.component';

describe('EtddepComponent', () => {
  let component: EtddepComponent;
  let fixture: ComponentFixture<EtddepComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EtddepComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EtddepComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
