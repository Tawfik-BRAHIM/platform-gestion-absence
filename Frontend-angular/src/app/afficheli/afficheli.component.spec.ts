import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AfficheliComponent } from './afficheli.component';

describe('AfficheliComponent', () => {
  let component: AfficheliComponent;
  let fixture: ComponentFixture<AfficheliComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AfficheliComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AfficheliComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
