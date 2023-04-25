import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EnseignatComponent } from './enseignat.component';

describe('EnseignatComponent', () => {
  let component: EnseignatComponent;
  let fixture: ComponentFixture<EnseignatComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EnseignatComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EnseignatComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
