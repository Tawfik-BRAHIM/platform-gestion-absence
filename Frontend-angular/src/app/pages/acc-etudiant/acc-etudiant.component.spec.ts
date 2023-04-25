import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AccEtudiantComponent } from './acc-etudiant.component';

describe('AccEtudiantComponent', () => {
  let component: AccEtudiantComponent;
  let fixture: ComponentFixture<AccEtudiantComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AccEtudiantComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AccEtudiantComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
