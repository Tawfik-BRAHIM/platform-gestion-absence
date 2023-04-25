import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ElidepComponent } from './elidep.component';

describe('ElidepComponent', () => {
  let component: ElidepComponent;
  let fixture: ComponentFixture<ElidepComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ElidepComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ElidepComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
