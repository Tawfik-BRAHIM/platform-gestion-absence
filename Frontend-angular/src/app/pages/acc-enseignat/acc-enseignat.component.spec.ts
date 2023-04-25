import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AccEnseignatComponent } from './acc-enseignat.component';

describe('AccEnseignatComponent', () => {
  let component: AccEnseignatComponent;
  let fixture: ComponentFixture<AccEnseignatComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AccEnseignatComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AccEnseignatComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
